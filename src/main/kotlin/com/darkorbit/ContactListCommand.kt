package com.darkorbit

interface ContactListCommand : ProtocolPacket {
	var contactList: MutableList<ContactBaseInfoCommand>
	var startIndex: Int
	var total: Int
}
