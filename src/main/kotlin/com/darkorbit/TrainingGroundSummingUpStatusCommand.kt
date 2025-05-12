package com.darkorbit

interface TrainingGroundSummingUpStatusCommand : TrainingGroundStatusDataModule {
	var matchResultType: PlayerMatchResultType
	var opponentName: String
	var opponentScore: Float
	var opponentWonRounds: Int
	var playerScore: Float
	var playerWonRounds: Int
	var reward: MutableList<RewardModule>
}
