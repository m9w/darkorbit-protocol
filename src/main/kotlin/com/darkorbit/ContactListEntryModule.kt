package com.darkorbit

interface ContactListEntryModule : ProtocolPacket {
	var attributeCommand: ContactListEntryAttributeCommand
	var typeCommand: ContactListEntryTypeCommand
}
