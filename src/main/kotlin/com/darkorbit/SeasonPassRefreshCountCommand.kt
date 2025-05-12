package com.darkorbit

interface SeasonPassRefreshCountCommand : ProtocolPacket {
	var dayCurrent: Int
	var dayMax: Int
	var isGold: Boolean
	var weekCurrent: Int
	var weekMax: Int
}
