package com.darkorbit

interface UserKeyBindingsUpdate : ProtocolPacket {
	var changedKeyBindings: MutableList<UserKeyBindingsModule>
	var remove: Boolean
}
