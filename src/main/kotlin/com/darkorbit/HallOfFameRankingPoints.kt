package com.darkorbit

interface HallOfFameRankingPoints : ProtocolPacket {
	var DestroyedByEnemies: Int
	var DestroyedByRadiationZone: Int
	var ExperiencePoints: Long
	var abovePoints: Int
	var aboveRanking: Int
	var belowPoints: Int
	var belowRanking: Int
	var daysSinceRegistration: Int
	var friendlyPlayersDestroyed: Int
	var honorPoints: Long
	var missionsCompleted: Int
	var npcShotPoints: Int
	var phoenixDestroyed: Int
	var playerShotPoints: Int
	var rankPoints: Long
	var shipsCategoryName: String
	var yourLevel: Int
	var yourRanking: Int
	var yourShipType: Int
}
