package com.darkorbit

interface EventANewHopeContributorCommand : ProtocolPacket {
	var count: Int
	var name: String
}
