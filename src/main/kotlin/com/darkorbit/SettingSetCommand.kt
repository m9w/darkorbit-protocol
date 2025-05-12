package com.darkorbit

interface SettingSetCommand : ProtocolPacket {
	var key: String
	var value: String
}
