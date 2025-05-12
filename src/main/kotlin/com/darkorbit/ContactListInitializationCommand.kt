package com.darkorbit

interface ContactListInitializationCommand : ProtocolPacket {
	var blockInvitations: ContactListBlockInvitationsModule
	var contactsCommand: ContactListUpdateContactsCommand
	var filterSettings: ContactListSettingsModule
}
