package com.darkorbit

interface BaseStackCommand : ProtocolPacket {
	var argsList: MutableList<ArgStackCommand>
	var enumBaseKey: BaseKey
	var stringBasekey: String
	var type: Int
}
