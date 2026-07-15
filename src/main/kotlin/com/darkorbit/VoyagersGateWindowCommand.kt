package com.darkorbit

interface VoyagersGateWindowCommand : ProtocolPacket {
	var Star1Seconds: Int
	var Star2Seconds: Int
	var Star3Seconds: Int
	var curLootAmount: Int
	var freeChallengedNum: Int
	var lootId: String
	var maxFreeNum: Int
	var maxOpenLevel: Int
	var starRewardLoots: MutableList<VoyagersGateStarRewardCommand>
}
