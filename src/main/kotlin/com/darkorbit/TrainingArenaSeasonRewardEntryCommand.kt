package com.darkorbit

interface TrainingArenaSeasonRewardEntryCommand : ProtocolPacket {
	var items: MutableList<RewardContentModule>
	var range: String
}
