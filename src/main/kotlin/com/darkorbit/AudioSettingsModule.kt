package com.darkorbit

interface AudioSettingsModule : ProtocolPacket {
	var music: Int
	var notSet: Boolean
	var playCombatMusic: Boolean
	var sound: Int
	var voice: Int
}
