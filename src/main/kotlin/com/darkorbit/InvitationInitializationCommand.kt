package com.darkorbit

interface InvitationInitializationCommand : ProtocolPacket {
	var candidateId: Int
	var candidateName: String
	var candidateShip: ShipIconModule
	var inviterId: Int
	var inviterName: String
	var inviterShip: ShipIconModule
}
