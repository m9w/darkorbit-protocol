package com.darkorbit

interface SeasonPassStatusCommand : ProtocolPacket {
	var extGoldPass: Boolean
	var goldPass: Boolean
	var marketingImage: String
	var pointsCost: MutableList<Int>
	var seasonName: String
	var timeToEventEnd: Long
	var uridiumCost: MutableList<Int>
}
