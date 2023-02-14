gh pr list -A jennajeh --json number -t '{{range .}}{{tablerow (printf "gh pr merge %v -md;" .number)}}{{end}}' > cmd.sh
