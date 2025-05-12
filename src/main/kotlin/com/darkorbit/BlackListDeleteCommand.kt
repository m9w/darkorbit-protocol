package com.darkorbit

interface BlackListDeleteCommand : ProtocolPacket {
	var blackList: MutableList<Int>
	var blackNameList: MutableList<String>
	var blackUserId: Int
	var success: Boolean
	var textCommand: BaseStackCommand
	var titleCommand: BaseStackCommand
}
