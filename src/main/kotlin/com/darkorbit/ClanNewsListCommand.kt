package com.darkorbit

interface ClanNewsListCommand : ProtocolPacket {
	var newsList: MutableList<ClanNewsInfoCommand>
}
