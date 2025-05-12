package com.darkorbit

interface SkylabModuleUpgradeCommand : ProtocolPacket {
	var credits: Int
	var endurium: Int
	var prometium: Int
	var terbium: Int
	var timeLeft: Long
	var timeNormal: Long
	var uridiumInstant: Int
}
