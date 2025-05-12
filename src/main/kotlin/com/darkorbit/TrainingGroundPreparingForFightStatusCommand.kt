package com.darkorbit

interface TrainingGroundPreparingForFightStatusCommand : TrainingGroundStatusDataModule {
	var opponentCombatStatusInfo: TrainingGroundPlayerCombatStatusInfoCommand
	var timer: Int
}
