package com.darkorbit

interface TrainingGroundFightStatusCommand : TrainingGroundStatusDataModule {
	var fightInfo: TrainingGroundFightInfoCommand
	var opponentInstanceId: Int
	var opponentName: String
	var opponentUid: Int
	var roundInfo: TrainingGroundRoundInfoCommand
	var seasonName: String
}
