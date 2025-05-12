package com.darkorbit

interface KillUiFullMessageCommand : ProtocolPacket {
	var mapId: Int
	var npcId: Int
	var totalAmountOfNpcOnMap: Int
}
