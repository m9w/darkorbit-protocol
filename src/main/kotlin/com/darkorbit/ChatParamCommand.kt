package com.darkorbit

interface ChatParamCommand : ProtocolPacket {
	var moduleList: MutableList<TupleTwoModule>
}
