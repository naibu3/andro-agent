from pathlib import Path

from andro_agent.pipelines.static_pipeline import StaticAnalysisPipeline


def test_pipeline_runs(tmp_path: Path):
    # Este test sería más un smoke test, requiere un APK real
    pipeline = StaticAnalysisPipeline(artifacts_dir=tmp_path)

    apk = Path("samples/AndroGoat.apk")

    state = pipeline.run(apk_path=apk, case_id="test_pipeline")

    assert state.status in ("completed", "failed")