package com.darkorbit

interface SeasonPassRewardInfoCommand : ProtocolPacket {
	var extGoldPassRewardItems: MutableList<SeasonPassRewardModule>
	var freeRewardItems: MutableList<SeasonPassRewardModule>
	var goldPassRewardItems: MutableList<SeasonPassRewardModule>
}
