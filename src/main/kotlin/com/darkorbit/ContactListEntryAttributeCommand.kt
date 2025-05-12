package com.darkorbit

interface ContactListEntryAttributeCommand : ProtocolPacket {
	var attributes: MutableList<ContactListEntryAttributeBaseModule>
	var userId: Int
}
