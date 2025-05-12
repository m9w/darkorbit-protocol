package com.darkorbit

interface CaptainRosterListCommand : ProtocolPacket {
	var captainList: MutableList<CaptainCommand>
}
