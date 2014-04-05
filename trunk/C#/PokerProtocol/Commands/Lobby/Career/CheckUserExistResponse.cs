﻿using System;
using System.Collections.Generic;
using System.Text;
using EricUtility;
using EricUtility.Networking.Commands;
using Newtonsoft.Json.Linq;

namespace PokerProtocol.Commands.Lobby.Career
{
    public class CheckUserExistResponse : AbstractLobbyResponse<CheckUserExistCommand>
    {
        public static string COMMAND_NAME = "lobbyCAREER_CHECK_USER_EXIST_RESPONSE";

        public bool Exist { get; set; }

        public CheckUserExistResponse()
            : base()
        {
        }

        public CheckUserExistResponse(CheckUserExistCommand command)
            : base(command)
        {
        }
    }
}
