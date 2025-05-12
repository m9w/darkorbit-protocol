package com.darkorbit

interface SkylabActionRequest : ProtocolPacket {
	var construction: String
	var countDuranium: Int
	var countEndurium: Int
	var countPromerium: Int
	var countPrometid: Int
	var countPrometium: Int
	var countSeprom: Int
	var countTerbium: Int
	var countXenomit: Int
	var subaction: String
	var transportMode: String
}
