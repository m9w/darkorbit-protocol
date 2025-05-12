package com.darkorbit

interface TrainingArenaSeasonInfoCommand : ProtocolPacket {
	var reward: MutableList<TrainingArenaSeasonRewardEntryCommand>
	var seasonDuration: Long
	var seasonName: String
}
