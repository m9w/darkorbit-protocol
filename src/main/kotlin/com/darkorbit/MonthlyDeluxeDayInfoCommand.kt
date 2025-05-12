package com.darkorbit

interface MonthlyDeluxeDayInfoCommand : ProtocolPacket {
	var daysClaimed: MutableList<Short>
	var isClaimable: Boolean
	var today: Short
}
