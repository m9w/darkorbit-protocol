package com.darkorbit

interface TrinityTrialsDropLevelCommand : ProtocolPacket {
	var buildSeconds: Int
	var building: Boolean
	var costLootAmount: Int
	var costLootId: String
	var currentLevel: Int
	var currentLevelQualityRandomList: MutableList<TupleTwoModule>
	var lootAmount: Int
	var max: Boolean
	var nextLevel: Int
	var nextLevelQualityRandomList: MutableList<TupleTwoModule>
	var skipConsume: Int
	var totalBuildSeconds: Int
}
