package com.darkorbit

interface ContactListRemoveContactsCommand : ProtocolPacket {
	var contactUserIds: MutableList<Int>
}
