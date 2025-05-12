package com.darkorbit

interface LogbookDataCommand : ProtocolPacket {
	var args: String
	var count: Int
	var info: String
	var infoText: String
	var insertDate: String
	var quest: Int
	var questDone: Int
}
