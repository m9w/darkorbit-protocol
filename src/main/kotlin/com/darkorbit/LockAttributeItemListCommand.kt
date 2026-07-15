package com.darkorbit

interface LockAttributeItemListCommand : ProtocolPacket {
	var moduleList: MutableList<LockAttributeItemModule>
	var remove: Boolean
}
