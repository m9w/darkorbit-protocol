package com.darkorbit

interface ContactListUpdateContactsCommand : ProtocolPacket {
	var contacts: MutableList<ContactListEntryModule>
}
