from __future__ import annotations

from abc import ABC, abstractmethod

from pydantic import BaseModel


class BaseTool(ABC):
    name: str
    description: str

    @abstractmethod
    def run(self, input_data: BaseModel) -> BaseModel:
        raise NotImplementedError