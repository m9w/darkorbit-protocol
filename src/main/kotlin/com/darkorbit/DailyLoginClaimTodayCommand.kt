package com.darkorbit

interface DailyLoginClaimTodayCommand : ProtocolPacket {
	var claimed: Boolean
	var day: Int
	var err: String
}
