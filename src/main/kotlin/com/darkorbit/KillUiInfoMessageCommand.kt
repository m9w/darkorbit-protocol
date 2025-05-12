package com.darkorbit

interface KillUiInfoMessageCommand : ProtocolPacket {
	var currentNpcKills: Int
	var currentNpcOnMap: Int
	var killNpcId: Int
	var mapId: Int
	var maxNpcAmountForMap: Int
	var spawnNpcId: Int
}
