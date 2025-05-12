package com.darkorbit

interface SoundTriggerModule : ProtocolPacket {
	var playSound: Boolean
	var soundId: Int
}
