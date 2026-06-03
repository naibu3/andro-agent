from __future__ import annotations

import hashlib
from pathlib import Path

from fastapi import HTTPException, UploadFile

from andro_agent.web.settings import MAX_UPLOAD_SIZE_BYTES, UPLOADS_DIR


ALLOWED_SUFFIXES = {".apk"}


async def save_uploaded_apk(file: UploadFile, case_id: str) -> tuple[Path, str]:
    filename = file.filename or "uploaded.apk"
    suffix = Path(filename).suffix.lower()

    if suffix not in ALLOWED_SUFFIXES:
        raise HTTPException(status_code=400, detail="Only .apk files are supported")

    upload_dir = UPLOADS_DIR / case_id
    upload_dir.mkdir(parents=True, exist_ok=True)

    apk_path = upload_dir / "original.apk"
    digest = hashlib.sha256()
    total_size = 0

    with apk_path.open("wb") as output:
        while chunk := await file.read(1024 * 1024):
            total_size += len(chunk)
            if total_size > MAX_UPLOAD_SIZE_BYTES:
                apk_path.unlink(missing_ok=True)
                raise HTTPException(status_code=413, detail="APK file is too large")

            digest.update(chunk)
            output.write(chunk)

    if total_size == 0:
        apk_path.unlink(missing_ok=True)
        raise HTTPException(status_code=400, detail="Uploaded file is empty")

    return apk_path, digest.hexdigest()
