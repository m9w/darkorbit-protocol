package com.darkorbit

interface SettingRemoveRequest : ProtocolPacket {
	var immediately: Boolean
	var key: String
}
