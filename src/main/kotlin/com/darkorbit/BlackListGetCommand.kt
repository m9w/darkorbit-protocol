package com.darkorbit

interface BlackListGetCommand : ProtocolPacket {
	var blackList: MutableList<Int>
	var blackNameList: MutableList<String>
}
