package com.darkorbit

interface TrainingGroundRegistrationStatusCommand : TrainingGroundStatusDataModule {
	var performance: TrainingArenaPerformanceInfoCommand
	var rank: TrainingArenaRankInfoCommand
	var season: TrainingArenaSeasonInfoCommand
}
