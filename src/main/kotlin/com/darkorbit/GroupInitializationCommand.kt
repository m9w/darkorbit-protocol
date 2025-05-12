package com.darkorbit

interface GroupInitializationCommand : ProtocolPacket {
	var id: Int
	var invitationMode: InvitationModeModule
	var leaderId: Int
	var maxSize: Int
	var members: MutableList<GroupMemberInitializationCommand>
}
