package com.darkorbit

interface ContactListEntryTypeCommand : ProtocolPacket {
	var contactEntryTypes: MutableList<ContactListEntryTypeModule>
	var userId: Int
}
