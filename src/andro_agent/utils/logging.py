import logging


def setup_logging(verbosity: int) -> None:
    if verbosity == 0:
        level = logging.WARNING
    elif verbosity == 1:
        level = logging.INFO
    else:
        level = logging.DEBUG

    logging.basicConfig(
        level=level,
        format="%(asctime)s | %(levelname)-8s | %(name)s | %(message)s",
    )

"""
USAGE EXAMPLE

```python
import logging

logger = logging.getLogger(__name__)

logger.info("Running manifest extraction")
logger.debug(f"APK path: {state.apk_path}")
"""