package com.darkorbit

interface TechStatusItemModule : ProtocolPacket {
	var amount: Int
	var seconds: Int
	var techStatus: StatusModule
}
