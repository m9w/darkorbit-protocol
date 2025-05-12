package com.darkorbit

interface UridiumBankInfoCommand : ProtocolPacket {
	var currentValue: Int
	var imgKey: String
	var maxValue: Int
	var price: String
	var secondsLeft: Int
	var textKey: String
}
