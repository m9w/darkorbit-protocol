package com.darkorbit

interface AudioSettingsRequest : ProtocolPacket {
	var music: Int
	var playCombatMusic: Boolean
	var sound: Int
	var voice: Int
}
