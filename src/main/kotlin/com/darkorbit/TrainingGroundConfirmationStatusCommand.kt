package com.darkorbit

interface TrainingGroundConfirmationStatusCommand : TrainingGroundStatusDataModule {
	var playerCombatStatusInfo: TrainingGroundPlayerCombatStatusInfoCommand
	var timer: Int
}
