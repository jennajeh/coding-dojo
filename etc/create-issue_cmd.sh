gh issue list -A jennajeh --json number -t '{{range .}}{{tablerow (printf "gh issue close %v;" .number)}}{{end}}' > issue_cmd.sh
