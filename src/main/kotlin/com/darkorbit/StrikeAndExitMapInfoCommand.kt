package com.darkorbit

interface StrikeAndExitMapInfoCommand : ProtocolPacket {
	var bossAlive: Boolean
	var bossType: Int
	var boxRemainingQuantity: Int
	var boxType: String
	var nextSpawnBossSeconds: Int
	var nextSpawnSeconds: Int
	var npcRemainingQuantity: MutableList<Int>
	var npcTypes: MutableList<Int>
	var spotLightUserName: String
	var spotLightUserX: Int
	var spotLightUserY: Int
	var stellarCoinLimit: Int
}
