package com.darkorbit

interface UserKeyBindingsModule : ProtocolPacket {
	var actionType: UserKeyBindingsModuleActionType
	var charCode: Short
	var keyCodes: MutableList<Int>
	var parameter: Int
}
