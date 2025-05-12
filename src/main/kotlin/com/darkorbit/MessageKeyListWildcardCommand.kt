package com.darkorbit

interface MessageKeyListWildcardCommand : ProtocolPacket {
	var commandList: MutableList<MessageKeyListWildcardModule>
}
