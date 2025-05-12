package com.darkorbit

interface InvitationRemovalCommand : ProtocolPacket {
	var candidateId: Int
	var inviterId: Int
	var reason: InvitationRemovalCommandReason
}
